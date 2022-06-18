package merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    /**
     * merchant's id: create failed -1
     */
    private Integer id;

}
