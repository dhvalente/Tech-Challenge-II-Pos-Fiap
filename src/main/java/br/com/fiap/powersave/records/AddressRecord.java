package br.com.fiap.powersave.records;

import jakarta.validation.constraints.NotEmpty;

public record AddressRecord(
        @NotEmpty(message = "{street.required}")String type,
        @NotEmpty(message = "{street.required}")String street,
        @NotEmpty(message = "{number.required}")String number,
        @NotEmpty(message = "{district.required}")String district,
        @NotEmpty(message = "{state.required}")String state,
        @NotEmpty(message = "{city.required}")String city ) {
}
