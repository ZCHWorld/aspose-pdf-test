package util;

import com.aspose.pdf.Document;
import com.aspose.pdf.SaveFormat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        File directory = new File("");
        String absolutePath = directory.getAbsolutePath();

        String sourcePath = absolutePath + "\\src\\main\\resources\\test.pdf";
        String savePath = sourcePath.replace("pdf", "html");

        Document pdf = new Document(sourcePath);
        // pdf convert to html,but html's title is empty
        // question is how can i set the html title before convert to html?
        pdf.save(savePath, SaveFormat.Html);
    }
}
