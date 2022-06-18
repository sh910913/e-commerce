package merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    /**
     * success return 0
     */
    private Integer errorCode = 0;
    /**
     * success return ""
     */
    private String errorMsg = "";
    private Object data;

    public Response(Object data) {
        this.data = data;
    }
}
