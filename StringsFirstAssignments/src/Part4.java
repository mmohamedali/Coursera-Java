import edu.duke.URLResource;

public class Part4 {
    public void urlResource() {
        URLResource file = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        String wordSearch = "youtube";

        for (String item : file.words()) {
            String itemLower = item.toLowerCase();
            int pos = itemLower.indexOf("youtube.com");
            if (pos != -1) {
                int beg = item.lastIndexOf("\"", pos);
                int end = item.indexOf("\"", pos + 1);
                System.out.println(item.substring(beg + 1, end));
            }
        }
    }
}
