/**
 * 
 */
package com.promineotech.jeep.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import com.promineotech.jeep.entity.Color;
import com.promineotech.jeep.entity.Customer;
import com.promineotech.jeep.entity.Engine;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.entity.Option;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import com.promineotech.jeep.entity.Tire;

/**
 * @author edwar
 *
 */
public interface JeepOrderDao {
  
  List<Option> fetchOptions(List<String> optionIds);

  /**
   * @param customer
   * @return
   */
  Optional<Customer> fetchCustomer(String customerId);

  /**
   * @param model
   * @param trim
   * @param doors
   * @return
   */
  Optional<Jeep> fetchModel(JeepModel model, String trim, int doors);

  /**
   * @param color
   * @return
   */
  Optional<Color> fetchColor(String colorId);

  /**
   * @param engine
   * @return
   */
  Optional<Engine> fetchEngine(String engineId);

  /**
   * @param tire
   * @return
   */
  Optional<Tire> fetchTire(String tireId);

  /**
   * @param customer
   * @param jeep
   * @param color
   * @param engine
   * @param tire
   * @param price
   * @param options 
   * @return
   */
  Order saveOrder(Customer customer, Jeep jeep, Color color, Engine engine, Tire tire,
      BigDecimal price, List<Option> options);

  /**
   * @param options
   * @return
   */
  

  /**
   * @param orderRequest
   * @return
   */
  

}
