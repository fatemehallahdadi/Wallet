package ir.mapsa.wallet.dto;


import ir.mapsa.wallet.base.BaseDto;
import ir.mapsa.wallet.entities.Enums.EType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionReportDto extends BaseDto {

    private Long id;

    private Boolean status;

    @NotBlank
    private BigDecimal amount;

    @NotBlank
    private Long sourceWalletId;

    @NotBlank
    private Long destinationWalletId;

    private String description;

    @NotBlank
    private EType type;

}
