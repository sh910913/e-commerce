package merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import merchants.constant.ErrorCode;
import merchants.dao.MerchantRepository;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    private Integer id;
    private String title;
    private String summary;
    private String desc;
    private Long limit;
    /**
     * 優惠券是否有Token, 用於商戶核銷
     * token is stored in Redis Set,每次領取從Redis中領取
     */
    private Boolean hasToken;
    private Integer background;
    private Date startDate;
    private Date endDate;

    public ErrorCode validate(MerchantRepository merchantRepository) {
        if (merchantRepository.findById(id).isEmpty()) {
            return ErrorCode.MERCHANT_NUMBER_DOES_EXIST;
        }
        return ErrorCode.SUCCESS;
    }


}
