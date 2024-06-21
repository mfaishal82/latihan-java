public class SecondCase {
    public static String formatReference(String input) {
        // Memisahkan nama depan dan belakang, lalu membalikkannya
        String[] parts = input.split("\\. ");
        String authorsPart = parts[0];
        String[] authors = authorsPart.split("\\., ");
        
        StringBuilder formattedAuthors = new StringBuilder();
        for (String author : authors) {
            String[] nameParts = author.split(", ");
            if (formattedAuthors.length() > 0) {
                formattedAuthors.append(", ");
            }
            formattedAuthors.append(nameParts[1].trim()).append(" ").append(nameParts[0].trim());
        }

        // Mengganti koma dengan titik koma dan menambahkan titik setelah tahun
        String rest = input.substring(input.indexOf(parts[1]));
        rest = rest.replace(",", ";");
        rest = rest.replace(");", ").");

        // Menggabungkan kembali dengan format yang benar
        String output = formattedAuthors.toString() + "; " + rest;
        return output;
    }

    public static void main(String[] args) {
        String input = "Agesen, Ole., Palsberg, Jens., Schwartzbach, Michael I. (1995). Type of SELF: Analysis of Objects with Dynamics and Multiple Inheritance. Software|Practice & Experience, 25(9):pp 975-995, Sep 1995.";
        String formattedReference = formatReference(input);
        System.out.println(formattedReference);
    }
}
