package merchants.constant;

/**
 * coupon's background color
 */
public enum TemplateColor {
    RED(1,"Red"),
    GREEN(2,"Green"),
    BLUE(3,"Blue");
    private Integer code;
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}
