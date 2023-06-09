/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author edwar
 *
 */
public interface JeepSalesService {

  /**
   * @param model
   * @param trim
   * @return
   */
  List<Jeep> fetchJeeps(JeepModel model, String trim);

  /**
   * @param image
   * @param jeepPK
   * @return
   */
  String uploadImage(MultipartFile image, Long jeepPK);

}
