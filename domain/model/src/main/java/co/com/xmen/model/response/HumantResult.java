package co.com.xmen.model.response;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
public class HumantResult {

    private int mutantDna;
    private int total;

}
