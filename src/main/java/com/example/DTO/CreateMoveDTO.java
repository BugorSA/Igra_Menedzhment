package com.example.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Created by pdybka on 24.06.16.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateMoveDTO {

    int boardRow;

    int boardColumn;
}
