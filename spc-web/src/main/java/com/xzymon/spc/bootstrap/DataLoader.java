package com.xzymon.spc.bootstrap;

import com.xzymon.spc.model.Owner;
import com.xzymon.spc.model.Vet;
import com.xzymon.spc.services.OwnerService;
import com.xzymon.spc.services.VetService;
import com.xzymon.spc.services.map.OwnerServiceMap;
import com.xzymon.spc.services.map.VetServiceMap;
import org.apache.catalina.util.ToStringUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();

	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Jackson");

		ownerService.save(owner1);
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Michael");
		owner2.setLastName("Jordan");

		ownerService.save(owner2);

		System.out.println("Owners loaded");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Louis");
		vet1.setLastName("de Lima");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(1L);
		vet2.setFirstName("Cristiano");
		vet2.setLastName("Ronaldo");

		vetService.save(vet2);

		System.out.println("Vets loaded");
	}
}
