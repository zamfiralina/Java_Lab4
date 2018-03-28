import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReportHtml implements Command {

    ReportHtml() throws IOException {
        StringBuilder str = new StringBuilder();

        str.append("<html><head><title>Catalog</title></head><body><table style = \"width:100%;text-align:center\">");

        for (String field : Arrays.stream(ClassDocument.class.getDeclaredFields())
                                  .map(Field::toString)
                                  .collect(Collectors.toList())) {
            str.append("<td>" + field.replace("java.lang.String ClassDocument."," ") + "</td>");
        }

        for (ClassDocument doc : Command.catalog.documents) {
            str.append("<tr>");

            for (String field : Arrays.stream(ClassDocument.class.getDeclaredFields())
                    .map(Field::toString)
                    .collect(Collectors.toList()))

                str.append("<td>" + doc.getValue(field.replace("java.lang.String ClassDocument.","")) + "</td>");

            str.append("</tr>");
        }

        str.append("</table></body></html>");

        FileWriter output = new FileWriter("catalogHtml.html");

        output.write(str.toString());

        output.flush();

        output.close();
    }
}
