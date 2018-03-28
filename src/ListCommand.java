public class ListCommand implements Command {
    public ListCommand() {
        //for (ClassDocument d : this.catalog.documents)

        System.out.println(this.catalog.documents);
    }
}
