package com.sf.openapi.waybill.print.ds;

import com.sf.openapi.waybill.print.dto.WaybillPrintDto;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class WaybillPrintForA4DS implements JRDataSource {

	private List<WaybillPrintDto> waybillList = null;

	private int index = -1;

	public void setWayBillList(List<WaybillPrintDto> waybillList) {
		this.waybillList = waybillList;
	}

	public boolean next() throws JRException {
		this.index += 1;
		return this.index < this.waybillList.size();
	}

	public Object getFieldValue(JRField jrField) throws JRException {
		WaybillPrintDto waybill = (WaybillPrintDto) this.waybillList.get(this.index);
		String fieldName = jrField.getName();
		Object rs = null;

		if ("mailNo".equals(fieldName))
			rs = waybill.getMailNo();
		else if ("expressType".equals(fieldName))
			rs = Integer.valueOf(waybill.getExpressType());
		else if ("payMethod".equals(fieldName))
			rs = Integer.valueOf(waybill.getPayMethod());
		else if ("returnTrackingNo".equals(fieldName))
			rs = waybill.getReturnTrackingNo();
		else if ("monthAccount".equals(fieldName))
			rs = waybill.getMonthAccount();
		else if ("payMethod".equals(fieldName))
			rs = Integer.valueOf(waybill.getPayMethod());
		else if ("deliverCompany".equals(fieldName))
			rs = waybill.getDeliverCompany();
		else if ("deliverName".equals(fieldName))
			rs = waybill.getDeliverName();
		else if ("deliverMobile".equals(fieldName))
			rs = waybill.getDeliverMobile();
		else if ("deliverTel".equals(fieldName))
			rs = waybill.getDeliverTel();
		else if ("deliverProvince".equals(fieldName))
			rs = waybill.getDeliverProvince();
		else if ("deliverCity".equals(fieldName))
			rs = waybill.getDeliverCity();
		else if ("deliverCounty".equals(fieldName))
			rs = waybill.getDeliverCounty();
		else if ("deliverAddress".equals(fieldName))
			rs = waybill.getDeliverAddress();
		else if ("deliverShipperCode".equals(fieldName))
			rs = waybill.getDeliverShipperCode();
		else if ("consignerCompany".equals(fieldName))
			rs = waybill.getConsignerCompany();
		else if ("consignerName".equals(fieldName))
			rs = waybill.getConsignerName();
		else if ("consignerMobile".equals(fieldName))
			rs = waybill.getConsignerMobile();
		else if ("consignerTel".equals(fieldName))
			rs = waybill.getConsignerTel();
		else if ("consignerProvince".equals(fieldName))
			rs = waybill.getConsignerProvince();
		else if ("consignerCity".equals(fieldName))
			rs = waybill.getConsignerCity();
		else if ("consignerCounty".equals(fieldName))
			rs = waybill.getConsignerCounty();
		else if ("consignerAddress".equals(fieldName))
			rs = waybill.getConsignerAddress();
		else if ("consignerShipperCode".equals(fieldName))
			rs = waybill.getConsignerShipperCode();
		else if ("cargo".equals(fieldName))
			rs = waybill.getCargo();
		else if ("cargoCount".equals(fieldName))
			rs = waybill.getCargoCount();
		else if ("cargoUnit".equals(fieldName))
			rs = waybill.getCargoUnit();
		else if ("childMailNo".equals(fieldName))
			rs = waybill.getChildMailNo();
		else if ("addedService".equals(fieldName))
			rs = waybill.getAddedService();
		else if ("electric".equals(fieldName))
			rs = waybill.getElectric();
		else if ("consignerShipperCode".equals(fieldName))
			rs = waybill.getConsignerShipperCode();
		else if ("destCode".equals(fieldName))
			rs = waybill.getDestCode();
		else if ("zipCode".equals(fieldName))
			rs = waybill.getZipCode();
		else if ("payZone".equals(fieldName))
			rs = waybill.getPayArea();
		else if ("insure".equals(fieldName))
			rs = waybill.getInsureValue();
		else if ("cod".equals(fieldName))
			rs = waybill.getCodValue();
		else if ("orderNo".equals(fieldName))
			rs = waybill.getOrderNo();
		else if ("mailNoStr".equals(fieldName))
			rs = waybill.getMailNoStr();
		else if ("childMailNoStr".equals(fieldName))
			rs = waybill.getChildMailNoStr();
		else if ("sku".equals(fieldName))
			rs = waybill.getSku();
		else if ("remark".equals(fieldName))
			rs = waybill.getRemark();
		else if ("childNum".equals(fieldName))
			rs = Integer.valueOf(waybill.getChildNum());
		else if ("piece".equals(fieldName))
			rs = Integer.valueOf(waybill.getPiece());
		else if ("mailNo_1".equals(fieldName))
			rs = waybill.getMailNo();
		else if ("expressType_1".equals(fieldName))
			rs = Integer.valueOf(waybill.getExpressType());
		else if ("payMethod_1".equals(fieldName))
			rs = Integer.valueOf(waybill.getPayMethod());
		else if ("returnTrackingNo_1".equals(fieldName))
			rs = waybill.getReturnTrackingNo();
		else if ("monthAccount_1".equals(fieldName))
			rs = waybill.getMonthAccount();
		else if ("payMethod_1".equals(fieldName))
			rs = Integer.valueOf(waybill.getPayMethod());
		else if ("deliverCompany_1".equals(fieldName))
			rs = waybill.getDeliverCompany();
		else if ("deliverName_1".equals(fieldName))
			rs = waybill.getDeliverName();
		else if ("deliverMobile_1".equals(fieldName))
			rs = waybill.getDeliverMobile();
		else if ("deliverTel_1".equals(fieldName))
			rs = waybill.getDeliverTel();
		else if ("deliverProvince_1".equals(fieldName))
			rs = waybill.getDeliverProvince();
		else if ("deliverCity_1".equals(fieldName))
			rs = waybill.getDeliverCity();
		else if ("deliverCounty_1".equals(fieldName))
			rs = waybill.getDeliverCounty();
		else if ("deliverAddress_1".equals(fieldName))
			rs = waybill.getDeliverAddress();
		else if ("deliverShipperCode_1".equals(fieldName))
			rs = waybill.getDeliverShipperCode();
		else if ("consignerCompany_1".equals(fieldName))
			rs = waybill.getConsignerCompany();
		else if ("consignerName_1".equals(fieldName))
			rs = waybill.getConsignerName();
		else if ("consignerMobile_1".equals(fieldName))
			rs = waybill.getConsignerMobile();
		else if ("consignerTel_1".equals(fieldName))
			rs = waybill.getConsignerTel();
		else if ("consignerProvince_1".equals(fieldName))
			rs = waybill.getConsignerProvince();
		else if ("consignerCity_1".equals(fieldName))
			rs = waybill.getConsignerCity();
		else if ("consignerCounty_1".equals(fieldName))
			rs = waybill.getConsignerCounty();
		else if ("consignerAddress_1".equals(fieldName))
			rs = waybill.getConsignerAddress();
		else if ("consignerShipperCode_1".equals(fieldName))
			rs = waybill.getConsignerShipperCode();
		else if ("cargo_1".equals(fieldName))
			rs = waybill.getCargo();
		else if ("cargoCount_1".equals(fieldName))
			rs = waybill.getCargoCount();
		else if ("cargoUnit_1".equals(fieldName))
			rs = waybill.getCargoUnit();
		else if ("childMailNo_1".equals(fieldName))
			rs = waybill.getChildMailNo();
		else if ("addedService_1".equals(fieldName))
			rs = waybill.getAddedService();
		else if ("electric_1".equals(fieldName))
			rs = waybill.getElectric();
		else if ("consignerShipperCode_1".equals(fieldName))
			rs = waybill.getConsignerShipperCode();
		else if ("destCode_1".equals(fieldName))
			rs = waybill.getDestCode();
		else if ("zipCode_1".equals(fieldName))
			rs = waybill.getZipCode();
		else if ("payZone_1".equals(fieldName))
			rs = waybill.getPayArea();
		else if ("insure_1".equals(fieldName))
			rs = waybill.getInsureValue();
		else if ("cod_1".equals(fieldName))
			rs = waybill.getCodValue();
		else if ("orderNo_1".equals(fieldName))
			rs = waybill.getOrderNo();
		else if ("mailNoStr_1".equals(fieldName))
			rs = waybill.getMailNoStr();
		else if ("childMailNoStr_1".equals(fieldName))
			rs = waybill.getChildMailNoStr();
		else if ("sku_1".equals(fieldName))
			rs = waybill.getSku();
		else if ("remark_1".equals(fieldName))
			rs = waybill.getRemark();
		else if ("childNum_1".equals(fieldName))
			rs = Integer.valueOf(waybill.getChildNum());
		else if ("piece_1".equals(fieldName)) {
			rs = Integer.valueOf(waybill.getPiece());
		}

		return rs;
	}
}