package com.springboot.cloud.nsclcservice.nsclc.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Description: TODO
 *
 * @author: ykn
 * @date: 2024年04月08日 8:47 PM
 **/
@Data
@AllArgsConstructor
public class UploadImageVo {
    private String diagnosisCode;
    private String imageFileLoc;
}
