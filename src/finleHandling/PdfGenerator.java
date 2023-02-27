//package finleHandling;
//
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import com.itextpdf.text.*;
//import java.lang.annotation.Documented;
//
//public class PdfGenerator {
//    public static void main(String[] args) throws FileNotFoundException, DocumentException {
//        String filePath = "/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/PdfTest.pdf";
//        Document document = new Document();
//        FileOutputStream fos = new FileOutputStream(filePath);
//
//        PdfWriter.getInstance(document,fos);
//        document.open();
//        Paragraph paragraph = new Paragraph("PDF Generated");
//        paragraph.setAlignment(Element.ALIGN_CENTER);
//        paragraph.setFont(new Font(Font.FontFamily.TIMES_ROMAN));
//        document.addTitle("Codekul");
//        document.add(paragraph);
//        document.close();
//    }
//}
