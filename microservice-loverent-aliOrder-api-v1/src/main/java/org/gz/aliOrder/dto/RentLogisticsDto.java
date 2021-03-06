package org.gz.aliOrder.dto;

import java.io.Serializable;
import java.util.List;

import org.gz.aliOrder.entity.RentLogistics;


/**
 * RentLogistics 实体类
 * @author phd
 */
public class RentLogisticsDto extends RentLogistics implements Serializable{


  /**
  * 
  */
  private static final long serialVersionUID = -5913394826257443241L;
  /**
   * 物流节点
   */
	private List<LogisticsNodes> logisticsNodes;
	public List<LogisticsNodes> getLogisticsNodes() {
		return logisticsNodes;
	}
	public void setLogisticsNodes(List<LogisticsNodes> logisticsNodes) {
		this.logisticsNodes = logisticsNodes;
	}
	
	
}
