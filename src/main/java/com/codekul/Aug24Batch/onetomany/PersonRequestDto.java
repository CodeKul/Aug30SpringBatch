package com.codekul.Aug24Batch.onetomany;

import com.codekul.Aug24Batch.onetomany.entity.MobileNumber;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PersonRequestDto {
    private String firstName;

    private String lastName;

    private String email;

    private List<MobileNumber> mobileNumber;
}
