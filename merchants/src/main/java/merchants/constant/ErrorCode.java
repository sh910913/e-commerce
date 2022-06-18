package merchants.constant;

public enum ErrorCode {
    SUCCESS(0,""),
    MERCHANT_NAME_IS_USED(1,"Merchant's name is used."),
    MERCHANT_LOGO_IS_EMPTY(2,"Merchant's logo is empty"),
    MERCHANT_BUSINESS_LICENSE(3,"Merchant's business license is empty"),
    MERCHANT_PHONE_NUMBER_IS_INCORRECT(4,"Merchant's phone number is incorrect"),
    MERCHANT_ADDRESS_IS_EMPTY(5,"Merchant's address is empty"),
    MERCHANT_NUMBER_DOES_EXIST(6,"Merchant's does exist");
    private Integer code;
    private String desc;

    ErrorCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
