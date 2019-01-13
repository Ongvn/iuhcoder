package iuh.olp;

import iuh.olp.Model.File;
import iuh.olp.Service.FileServices;
import iuh.olp.Service.ImageFileServices;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileServices fileServices = new ImageFileServices();
        File myFile = new File();

        myFile.setLocation("D:\\Ong\\Study\\IUH_Coder\\BackEnd\\week 1\\temp\\src\\hmmm.PNG");
        String newDestination = "D:\\Ong\\Study\\IUH_Coder\\BackEnd\\week 1\\temp\\des\\ayyy.PNG";

        BufferedImage buffer = ((ImageFileServices) fileServices).rotateImage(myFile, 3.14159);
        System.out.println("Read!\nRotated!");

        ((ImageFileServices) fileServices).writeImageFile(buffer,newDestination);
        System.out.println("Writed!");
    }
}
