package ie.atu.labexam;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class InfoController {

    private InfoService myInfo;

    public InfoController(InfoService myInfo){
        this.myInfo = myInfo;
    }

    @PostMapping("/rentals")
    public List<Info> addInfo(@Valid @RequestBody Info info){
        return myInfo.addInfo(info);
    }

    @GetMapping("/rentals/{rentalCode}")
    public List<Info> getInfo(Info info){
        return myInfo.getInfo(info);
    }

    @PutMapping("/rentals/{rentalCode}")
    public List<Info> putInfo(@Valid @RequestBody Info info){
        return myInfo.putInfo(info);
    }

    @PutMapping("/rentals/{rentalCode}")
    public List<Info> deleteInfo(@Valid @RequestBody Info info) {
        return myInfo.deleteInfo(info);
    }

}
