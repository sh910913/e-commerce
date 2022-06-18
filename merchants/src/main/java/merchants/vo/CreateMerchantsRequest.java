package merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import merchants.constant.ErrorCode;
import merchants.dao.MerchantRepository;
import merchants.entity.Merchant;
import org.apache.commons.lang.StringUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    private String name;
    private String logoUrl;
    private String businessLicenseUrl;
    private String phone;
    private String address;

    public ErrorCode validate(MerchantRepository repository) {
        if (!repository.findByName(this.name).isEmpty()) {
            return ErrorCode.MERCHANT_NUMBER_DOES_EXIST;
        }
        if (StringUtils.isEmpty(this.logoUrl)) {
            return ErrorCode.MERCHANT_LOGO_IS_EMPTY;
        }
        if (StringUtils.isEmpty(this.businessLicenseUrl)) {
            return ErrorCode.MERCHANT_BUSINESS_LICENSE;
        }
        if (StringUtils.isEmpty(this.address)) {
            return ErrorCode.MERCHANT_ADDRESS_IS_EMPTY;
        }
        if (StringUtils.isEmpty(this.phone)) {
            return ErrorCode.MERCHANT_PHONE_NUMBER_IS_INCORRECT;
        }
        return ErrorCode.SUCCESS;
    }

    public Merchant toMerchants() {
        var merchant = new Merchant();

        merchant.setName(name);
        merchant.setLogoUrl(logoUrl);
        merchant.setBusinessLicenseUrl(businessLicenseUrl);
        merchant.setPhone(phone);
        merchant.setAddress(address);
        return merchant;
    }
}
