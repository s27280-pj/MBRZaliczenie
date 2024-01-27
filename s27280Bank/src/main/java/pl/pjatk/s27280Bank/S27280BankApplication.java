package pl.pjatk.s27280Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S27280BankApplication {
	public S27280BankApplication(TransferService transferService, ClientStorage clientStorage){

		//System.out.println(transferService.sendMoney("2",400));
		//System.out.println(transferService.addMoney("2",800));
		//Client newMember = new Client("4","Karol", 900);
		//clientStorage.registerClient(newMember);
		//clientStorage.showClient();
		//System.out.println(clientStorage.findClientbyID("2"));
		//System.out.println(transferService.addMoney("ansdj",222));

	}

	public static void main(String[] args) {
		SpringApplication.run(S27280BankApplication.class, args);
	}

}
