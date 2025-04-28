package com.Profileex.input;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("prod")
public class ProductionServer implements GenericService{
		@Value("${prod.info.code}")
		private String code;

	public ProductionServer() {
			super();
		}
	
	public ProductionServer(String code) {
		super();
		this.code = code;
	}


	public String getCode() {
			return code;
		}


		public void setCode(String code) {
			this.code = code;
		}


	@Override
		public String toString() {
			return "ProductionServer [code=" + code + "]";
		}

	public void task() {
		System.out.println("This from production server:"+code);
	}

}

