package com.nhom1.lab3.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class student {
   @NotBlank(message = "Không để trống email")
   @Email(message = "Không đúng định dạng email")
    String email;
   @NotBlank(message = "Không để trống họ và tên")
    String fullname;
   @NotNull(message = "Không để trống điểm")
   @PositiveOrZero(message = "Điểm phải lớn hơn hoặc bằng 0")
   @Max(value = 10, message = "Điểm phải bé hơn hoặc bằng 10")
    Double marks;
   @NotNull(message = "Phải chọn giới tính")
    Boolean gender;
   @NotBlank(message = "Chọn quốc tịch!")
    String country;
}
