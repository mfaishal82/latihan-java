public class FirstCase {
    public static String formatReference(String input) {
        // Memisahkan nama depan dan belakang, lalu membalikkannya
        String[] parts = input.split("\\. ");
        String author = parts[0];
        String[] names = author.split(", ");
        String reversedAuthor = names[1] + " " + names[0];

        // Mengganti koma dengan titik koma dan menambahkan titik setelah tahun
        String rest = parts[1].replace(",", ";");
        rest = rest.replace(");", ").");

        // Menggabungkan kembali dengan format yang benar
        String output = reversedAuthor + "; " + rest;
        return output;
    }

    public static void main(String[] args) {
        String input = "Anton, Howard. (2004), Elementary Linear Algebra, 9th ed, Wiley.";
        String formattedReference = formatReference(input);
        System.out.println(formattedReference);
    }
}