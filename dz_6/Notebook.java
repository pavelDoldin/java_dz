package dz_6;

public class Notebook {
    private String maker;
    private String model;
    private Integer ram;
    private Integer rom;
    private String os;
    private String color;
    private Double price;

    Notebook(String maker, String model, Integer ram, Integer rom, String os, String color, Double price) {
        this.maker = maker;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "[" + maker + " " + model + "] " + "\\Объём ОЗУ: " + ram +
                "ГБ\\ Объём ЖД: " + rom + "ГБ\\ ОС: " + os + "\\ Цвет: " +
                color + "\\ Цена: " + price +"руб\\";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notebook)) {
            return false;
        }
        Notebook note = (Notebook) obj;
        return maker.equals(note.maker) && model.equals(note.model) && ram.equals(note.ram) &&
                rom.equals(note.rom) && os.equals(note.os) && color.equals(note.color);
    }

    @Override
    public int hashCode() {
        return maker.hashCode() + 7 * model.hashCode() + 11 * ram.hashCode() + 13 * rom.hashCode() +
                17 * os.hashCode() + 19 * color.hashCode();
    }
}