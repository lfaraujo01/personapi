package lux.com.personapi.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lux.com.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotNull
    @
    private String number;
}
