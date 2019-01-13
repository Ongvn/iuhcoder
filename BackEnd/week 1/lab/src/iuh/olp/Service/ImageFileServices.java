package iuh.olp.Service;

import iuh.olp.Model.File;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageFileServices extends FileServices{

    public BufferedImage rotateImage(File file, double radians) throws IOException {
        BufferedImage buffer = ImageIO.read(
                Files.newInputStream(
                        Paths.get(file.getLocation())
                )
        );
        AffineTransform tx = new AffineTransform();

        tx.rotate(radians, buffer.getWidth()/2, buffer.getHeight()/2);

        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
        buffer  = op.filter(buffer, null);
        return buffer;
    }

    public boolean writeImageFile(BufferedImage file, String destination) throws IOException {
        String extension = "PNG";
        ImageIO.write(
                file,
                extension,
                Files.newOutputStream(
                        Paths.get(destination)
                )
        );
        return true;
    }

}
