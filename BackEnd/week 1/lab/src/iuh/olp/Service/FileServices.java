package iuh.olp.Service;

import iuh.olp.Model.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServices {

    public byte[] readFile (String fileLocation) throws IOException {
        Path path = Paths.get(fileLocation);
        byte[] data = Files.readAllBytes(path);
        return data;
    }

    public boolean writeFile(byte[] data, String destination) throws IOException {
        Path path = Paths.get(destination);
        Files.write(path, data);
        return true;
    }

    public void showInfo(File file){
        System.out.println(file.toString());
    }

}
