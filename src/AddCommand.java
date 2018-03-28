public class AddCommand implements Command{

    public AddCommand() {}

    public AddCommand(ClassDocument document) {
        this.catalog.documents.add(document);
    }


}
