/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.promineotech.jeep.dao.JeepSalesDao;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author edwar
 *
 */
@Service
@Slf4j
public class DefaultJeepSalesService implements JeepSalesService {
  
  
  @Autowired
  private JeepSalesDao jeepSalesDao;
  /**
   * 
   */
  
  @Transactional
  @Override
  public String uploadImage(MultipartFile image, Long modelPK) {
    String imageId = UUID.randomUUID().toString();
    
    log.debug("Uploading image with ID={}", imageId);
    return null;
  }
  
  
  @Transactional(readOnly = true)
  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    log.info("The fetchJeeps method was called with model={} and trim={}", model, trim);
    
    List<Jeep> jeeps = jeepSalesDao.fetchJeeps(model, trim);
    
    if(jeeps.isEmpty()) {
      String msg = String.format("No jeeps found with model=%s and trim=%s", model, trim);
      throw new NoSuchElementException(msg);
    }
    
    Collections.sort(jeeps);
    return jeeps;
  }
  
  
  

}
