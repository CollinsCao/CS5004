/**
 * Represents a shoe with a kind, color, brand and size.
 */
public class Shoe {

    private Kind kind;
    private Color color;
    private Brand brand;
    private double size;

    /**
     * Constructs a Shoe with the given attributes.
     *
     * @param kind the kind of the shoe
     * @param color the color of the shoe
     * @param brand the brand of the shoe
     * @param size the size of the shoe
     * @throws IllegalArgumentException if the brand is NIKE and the kind is DRESS
     */
    public Shoe(Kind kind, Color color, Brand brand, Double size) {
        if (brand == Brand.NIKE && kind == Kind.DRESS) {
            throw new IllegalArgumentException("Nike does not sell dress shoes.");
        }
        this.kind = kind;
        this.color = color;
        this.brand = brand;
        this.size = size;
    }
    /**
     * Returns the kind of the shoe.
     */
    public Kind getKind() {
        return kind;
    }

    /**
     * Return the color of the shoe.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Return the brand of the shoe.
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Return the size of the shoe.
     */
    public Double getSize() {
        return size;
    }

    @Override
    public String toString() {
        String kindStr;
        switch (kind) {
            case SNEAKER:
                kindStr = "Sneaker";
                break;
            case BOOT:
                kindStr = "Boot";
                break;
            case DRESS:
                kindStr = "Dress Shoe";
                break;
            default:
                kindStr = "Casual Shoe";
        }

        String colorStr;
        switch (color) {
            case BLACK:
                colorStr = "Black";
                break;
            case WHITE:
                colorStr = "White";
                break;
            case BROWN:
                colorStr = "Brown";
                break;
            default:
                colorStr = "Pastel";
        }

        String brandStr;
        switch (brand) {
            case NIKE:
                brandStr = "Nike";
                break;
            case ADIDAS:
                brandStr = "Adidas";
                break;
            case CLARKS:
                brandStr = "Clarks";
                break;
            default:
                brandStr = "Gucci";
        }

        return "Shoe: "
                + brandStr + " "
                + colorStr + " "
                + kindStr
                + " (Size " + size + ")";

    }
}