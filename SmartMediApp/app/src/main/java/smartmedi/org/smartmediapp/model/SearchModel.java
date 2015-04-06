package smartmedi.org.smartmediapp.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by vignesh on 05/04/15.
 */

@Table(name="SearchModel")
public class SearchModel extends Model {

    @Column(name="searchType")
    private String searchType;

    @Column(name="lastUpdated")
    private String lastUpdated;

    @Column(name="location")
    private String location;

    @Column(name="searchTypeName")
    private String searchTypeName;

    public SearchModel(){
        super();
    }

    public void saveData(String searchType,String location,String searchTypeName){
        this.searchType=searchType;
        this.location=location;
        this.searchTypeName=searchTypeName;
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String lastUpdated=simpleDateFormat.format(new Date());
        this.lastUpdated=lastUpdated;
    }

    public List<SearchModel> selectData(){
       return new Select().from(SearchModel.class).execute();
    }
}

