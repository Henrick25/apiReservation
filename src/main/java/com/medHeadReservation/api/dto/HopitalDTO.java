package com.medHeadReservation.api.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HopitalDTO {



        private Long id;
        private String name;
        private Double latitude;
        private Double longitude;
        private Long lit;
        private String numeroDeRue;
        private String rue;
        private String postal;

}
