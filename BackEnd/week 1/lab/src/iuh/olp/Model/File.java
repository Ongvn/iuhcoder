package iuh.olp.Model;

import java.util.Objects;

public class File {

    private String extension;
    private String fileName;
    private String location;
    private String type;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExtension() {
        return extension;
    }

    public String getFileName() {
        return fileName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(extension, file.extension) &&
                Objects.equals(fileName, file.fileName) &&
                Objects.equals(location, file.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extension, fileName, location);
    }
}
