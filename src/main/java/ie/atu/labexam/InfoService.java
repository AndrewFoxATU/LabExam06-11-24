package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {
    private List<Info> myList = new ArrayList<>();
    public List<Info> addInfo(Info info)
    {
        myList.add(info);
        return myList;
    }
    public List<Info> getInfo(Info info)
    {
        return myList;
    }

    public List<Info> putInfo(Info info)
    {
        for(int i = 0; i < myList.size(); i++){
            if(info.getRentalCode()==myList.get(i).getRentalCode()){
                info = myList.set(i, info);
            }
        }
        return myList;
    }

    public List<Info> deleteInfo(Info info)
    {
        for(int i = 0; i < myList.size(); i++){
            if(info.getRentalCode()==myList.get(i).getRentalCode()){
                info = myList.remove(i);
            }
        }
        return myList;
    }

}
