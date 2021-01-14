package ait.com.nan.countroguest;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> lstData;
    CustomAdapter adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = new ArrayList<>();
        lstData.add(new DataItem(R.drawable.afghanistan,"Afghanistan"));
        lstData.add(new DataItem(R.drawable.albania,"Albania"));
        lstData.add(new DataItem(R.drawable.algeria,"Algeria"));
        lstData.add(new DataItem(R.drawable.andorra,"Andorra"));
        lstData.add(new DataItem(R.drawable.angola,"Angola"));
        lstData.add(new DataItem(R.drawable.antigua_and_barbuda,"Antigua And Barbuda"));
        lstData.add(new DataItem(R.drawable.argentina,"Argentina"));
        lstData.add(new DataItem(R.drawable.armenia,"Armenia"));
        lstData.add(new DataItem(R.drawable.australia,"Australia"));
        lstData.add(new DataItem(R.drawable.austria,"Austria"));
        lstData.add(new DataItem(R.drawable.azerbaijan,"Azerbaijan"));
        lstData.add(new DataItem(R.drawable.bahamas,"Bahamas"));
        lstData.add(new DataItem(R.drawable.bahrain,"Bahrain"));
        lstData.add(new DataItem(R.drawable.bangladesh,"Bangladesh"));
        lstData.add(new DataItem(R.drawable.barbados,"Barbados"));
        lstData.add(new DataItem(R.drawable.belarus,"Belarus"));
        lstData.add(new DataItem(R.drawable.belgium,"Belgium"));
        lstData.add(new DataItem(R.drawable.belize,"Belize"));
        lstData.add(new DataItem(R.drawable.benin,"Benin"));
        lstData.add(new DataItem(R.drawable.bhutan,"Bhutan"));
        lstData.add(new DataItem(R.drawable.bolivia,"Bolivia"));
        lstData.add(new DataItem(R.drawable.bosnia_and_herzegovina,"Bosnia And Herzegovina"));
        lstData.add(new DataItem(R.drawable.botswana,"Botswana"));
        lstData.add(new DataItem(R.drawable.brazil,"Brazil"));
        lstData.add(new DataItem(R.drawable.brunei,"Brunei"));
        lstData.add(new DataItem(R.drawable.bulgaria,"Bulgaria"));
        lstData.add(new DataItem(R.drawable.burkina_faso,"Burkina Faso"));
        lstData.add(new DataItem(R.drawable.burundi,"Burundi"));
        lstData.add(new DataItem(R.drawable.cambodia,"Cambodia"));
        lstData.add(new DataItem(R.drawable.cameroon,"Cameroon"));
        lstData.add(new DataItem(R.drawable.canada,"Canada"));
        lstData.add(new DataItem(R.drawable.cape_verde,"Cape Verde"));
        lstData.add(new DataItem(R.drawable.chad,"Chad"));
        lstData.add(new DataItem(R.drawable.chile,"Chile"));
        lstData.add(new DataItem(R.drawable.china,"China"));
        lstData.add(new DataItem(R.drawable.colombia,"Colombia"));
        lstData.add(new DataItem(R.drawable.comoros,"Comoros"));
        lstData.add(new DataItem(R.drawable.congo,"Congo"));
        lstData.add(new DataItem(R.drawable.costa_rica,"Costa Rica"));
        lstData.add(new DataItem(R.drawable.cote_d_ivoire,"Cote D Ivoire"));
        lstData.add(new DataItem(R.drawable.croatia,"Croatia"));
        lstData.add(new DataItem(R.drawable.cuba,"Cuba"));
        lstData.add(new DataItem(R.drawable.cyprus,"Cyprus"));
        lstData.add(new DataItem(R.drawable.czech_republic,"Czech Republic"));
        lstData.add(new DataItem(R.drawable.denmark,"Denmark"));
        lstData.add(new DataItem(R.drawable.djibouti,"Djibouti"));
        lstData.add(new DataItem(R.drawable.dominica,"Dominica"));
        lstData.add(new DataItem(R.drawable.dominican_republic,"Dominican Republic"));
        lstData.add(new DataItem(R.drawable.east_timor,"East Timor"));
        lstData.add(new DataItem(R.drawable.ecuador,"Ecuador"));
        lstData.add(new DataItem(R.drawable.egypt,"Egypt"));
        lstData.add(new DataItem(R.drawable.el_salvador,"El Salvador"));
        lstData.add(new DataItem(R.drawable.equatorial_guinea,"Equatorial Guinea"));
        lstData.add(new DataItem(R.drawable.eritrea,"Eritrea"));
        lstData.add(new DataItem(R.drawable.estonia,"Estonia"));
        lstData.add(new DataItem(R.drawable.ethiopia,"Ethiopia"));
        lstData.add(new DataItem(R.drawable.fiji,"Fiji"));
        lstData.add(new DataItem(R.drawable.finland,"Finland"));
        lstData.add(new DataItem(R.drawable.france,"France"));
        lstData.add(new DataItem(R.drawable.gabon,"Gabon"));
        lstData.add(new DataItem(R.drawable.gambia,"Gambia"));
        lstData.add(new DataItem(R.drawable.georgia,"Georgia"));
        lstData.add(new DataItem(R.drawable.germany,"Germany"));
        lstData.add(new DataItem(R.drawable.ghana,"Ghana"));
        lstData.add(new DataItem(R.drawable.greece,"Greece"));
        lstData.add(new DataItem(R.drawable.grenada,"Grenada"));
        lstData.add(new DataItem(R.drawable.guatemala,"Guatemala"));
        lstData.add(new DataItem(R.drawable.guinea,"Guinea"));
        lstData.add(new DataItem(R.drawable.guinea_bissau,"Guinea Bissau"));
        lstData.add(new DataItem(R.drawable.guyana,"Guyana"));
        lstData.add(new DataItem(R.drawable.haiti,"Haiti"));
        lstData.add(new DataItem(R.drawable.honduras,"Honduras"));
        lstData.add(new DataItem(R.drawable.hungary,"Hungary"));
        lstData.add(new DataItem(R.drawable.iceland,"Iceland"));
        lstData.add(new DataItem(R.drawable.india,"India"));
        lstData.add(new DataItem(R.drawable.indonesia,"Indonesia"));
        lstData.add(new DataItem(R.drawable.iran,"Iran"));
        lstData.add(new DataItem(R.drawable.iraq,"Iraq"));
        lstData.add(new DataItem(R.drawable.ireland,"Ireland"));
        lstData.add(new DataItem(R.drawable.israel,"Israel"));
        lstData.add(new DataItem(R.drawable.italy,"Italy"));
        lstData.add(new DataItem(R.drawable.jamaica,"Jamaica"));
        lstData.add(new DataItem(R.drawable.japan,"Japan"));
        lstData.add(new DataItem(R.drawable.jordan,"Jordan"));
        lstData.add(new DataItem(R.drawable.kazakhstan,"Kazakhstan"));
        lstData.add(new DataItem(R.drawable.kenya,"Kenya"));
        lstData.add(new DataItem(R.drawable.kiribati,"Kiribati"));
        lstData.add(new DataItem(R.drawable.kosovo,"Kosovo"));
        lstData.add(new DataItem(R.drawable.kuwait,"Kuwait"));
        lstData.add(new DataItem(R.drawable.kyrgyzstan,"Kyrgyzstan"));
        lstData.add(new DataItem(R.drawable.laos,"Laos"));
        lstData.add(new DataItem(R.drawable.latvia,"Latvia"));
        lstData.add(new DataItem(R.drawable.lebanon,"Lebanon"));
        lstData.add(new DataItem(R.drawable.lesotho,"Lesotho"));
        lstData.add(new DataItem(R.drawable.liberia,"Liberia"));
        lstData.add(new DataItem(R.drawable.libya,"Libya"));
        lstData.add(new DataItem(R.drawable.liechtenstein,"Liechtenstein"));
        lstData.add(new DataItem(R.drawable.lithuania,"Lithuania"));
        lstData.add(new DataItem(R.drawable.luxembourg,"Luxembourg"));
        lstData.add(new DataItem(R.drawable.macedonia,"Macedonia"));
        lstData.add(new DataItem(R.drawable.madagascar,"Madagascar"));
        lstData.add(new DataItem(R.drawable.malawi,"Malawi"));
        lstData.add(new DataItem(R.drawable.malaysia,"Malaysia"));
        lstData.add(new DataItem(R.drawable.maldives,"Maldives"));
        lstData.add(new DataItem(R.drawable.mali,"Mali"));
        lstData.add(new DataItem(R.drawable.malta,"Malta"));
        lstData.add(new DataItem(R.drawable.marshall,"Marshall"));
        lstData.add(new DataItem(R.drawable.mauritania,"Mauritania"));
        lstData.add(new DataItem(R.drawable.mauritius,"Mauritius"));
        lstData.add(new DataItem(R.drawable.mexico,"Mexico"));
        lstData.add(new DataItem(R.drawable.micronesia,"Micronesia"));
        lstData.add(new DataItem(R.drawable.moldova,"Moldova"));
        lstData.add(new DataItem(R.drawable.monaco,"Monaco"));
        lstData.add(new DataItem(R.drawable.mongolia,"Mongolia"));
        lstData.add(new DataItem(R.drawable.montenegro,"Montenegro"));
        lstData.add(new DataItem(R.drawable.morocco,"Morocco"));
        lstData.add(new DataItem(R.drawable.mozambique,"Mozambique"));
        lstData.add(new DataItem(R.drawable.myanmar,"Myanmar"));
        lstData.add(new DataItem(R.drawable.namibia,"Namibia"));
        lstData.add(new DataItem(R.drawable.nauru,"Nauru"));
        lstData.add(new DataItem(R.drawable.nepal,"Nepal"));
        lstData.add(new DataItem(R.drawable.netherlands,"Netherlands"));
        lstData.add(new DataItem(R.drawable.new_zealand,"New Zealand"));
        lstData.add(new DataItem(R.drawable.nicaragua,"Nicaragua"));
        lstData.add(new DataItem(R.drawable.niger,"Niger"));
        lstData.add(new DataItem(R.drawable.nigeria,"Nigeria"));
        lstData.add(new DataItem(R.drawable.niue,"Niue"));
        lstData.add(new DataItem(R.drawable.north_korea,"North Korea"));
        lstData.add(new DataItem(R.drawable.norway,"Norway"));
        lstData.add(new DataItem(R.drawable.oman,"Oman"));
        lstData.add(new DataItem(R.drawable.pakistan,"Pakistan"));
        lstData.add(new DataItem(R.drawable.palau,"Palau"));
        lstData.add(new DataItem(R.drawable.panama,"Panama"));
        lstData.add(new DataItem(R.drawable.papua_new_guinea,"Papua New Guinea"));
        lstData.add(new DataItem(R.drawable.paraguay,"Paraguay"));
        lstData.add(new DataItem(R.drawable.peru,"Peru"));
        lstData.add(new DataItem(R.drawable.philippines,"Philippines"));
        lstData.add(new DataItem(R.drawable.poland,"Poland"));
        lstData.add(new DataItem(R.drawable.portugal,"Portugal"));
        lstData.add(new DataItem(R.drawable.qatar,"Qatar"));
        lstData.add(new DataItem(R.drawable.romania,"Romania"));
        lstData.add(new DataItem(R.drawable.russia,"Russia"));
        lstData.add(new DataItem(R.drawable.rwanda,"Rwanda"));
        lstData.add(new DataItem(R.drawable.saint_kitts_and_nevis,"Saint Kitts And Nevis"));
        lstData.add(new DataItem(R.drawable.saint_lucia,"Saint Lucia"));
        lstData.add(new DataItem(R.drawable.saint_vincent_and_the_grenadines,"Saint Vincent And The Grenadines"));
        lstData.add(new DataItem(R.drawable.samoa,"Samoa"));
        lstData.add(new DataItem(R.drawable.san_marino,"San Marino"));
        lstData.add(new DataItem(R.drawable.sao_tome_and_principe,"Sao Tome And Principle"));
        lstData.add(new DataItem(R.drawable.saudi_arabia,"Saudi Arabia"));
        lstData.add(new DataItem(R.drawable.senegal,"Senegal"));
        lstData.add(new DataItem(R.drawable.serbia,"Serbia"));
        lstData.add(new DataItem(R.drawable.seychelles,"Seychelles"));
        lstData.add(new DataItem(R.drawable.sierra_leone,"sierra_leone"));
        lstData.add(new DataItem(R.drawable.singapore,"Singapore"));
        lstData.add(new DataItem(R.drawable.slovakia,"Slovakia"));
        lstData.add(new DataItem(R.drawable.slovenia,"Slovenia"));
        lstData.add(new DataItem(R.drawable.solomon_islands,"Solomon Islands"));
        lstData.add(new DataItem(R.drawable.somalia,"Somalia"));
        lstData.add(new DataItem(R.drawable.south_africa,"South Africa"));
        lstData.add(new DataItem(R.drawable.south_korea,"South Korea"));
        lstData.add(new DataItem(R.drawable.south_sudan,"South Sudan"));
        lstData.add(new DataItem(R.drawable.spain,"Spain"));
        lstData.add(new DataItem(R.drawable.sri_lanka,"Sri Lanka"));
        lstData.add(new DataItem(R.drawable.sudan,"Sudan"));
        lstData.add(new DataItem(R.drawable.suriname,"Suriname"));
        lstData.add(new DataItem(R.drawable.swaziland,"Swaziland"));
        lstData.add(new DataItem(R.drawable.sweden,"Sweden"));
        lstData.add(new DataItem(R.drawable.switzerland,"Switzerland"));
        lstData.add(new DataItem(R.drawable.syria,"Syria"));
        lstData.add(new DataItem(R.drawable.taiwan,"Taiwan"));
        lstData.add(new DataItem(R.drawable.tajikistan,"Tajikistan"));
        lstData.add(new DataItem(R.drawable.tanzania,"Tanzania"));
        lstData.add(new DataItem(R.drawable.thailand,"Thailand"));
        lstData.add(new DataItem(R.drawable.the_central_african_republic,"The Central African Republic"));
        lstData.add(new DataItem(R.drawable.the_democratic_republic_of_the_congo,"The Democratic Republic Of The Congo"));
        lstData.add(new DataItem(R.drawable.the_republic_of_the_congo,"The Republic Of The Congo"));
        lstData.add(new DataItem(R.drawable.togo,"Togo"));
        lstData.add(new DataItem(R.drawable.tonga,"Tonga"));
        lstData.add(new DataItem(R.drawable.trinidad_and_tobago,"Trinidad And Tobago"));
        lstData.add(new DataItem(R.drawable.tunisia,"Tunisia"));
        lstData.add(new DataItem(R.drawable.turkey,"Turkey"));
        lstData.add(new DataItem(R.drawable.turkmenistan,"Turkmenistan"));
        lstData.add(new DataItem(R.drawable.tuvalu,"Tuvalu"));
        lstData.add(new DataItem(R.drawable.uganda,"Uganda"));
        lstData.add(new DataItem(R.drawable.ukraine,"Ukraine"));
        lstData.add(new DataItem(R.drawable.united_arab_emirates,"United Arab Emirates"));
        lstData.add(new DataItem(R.drawable.united_kingdom,"United Kingdom"));
        lstData.add(new DataItem(R.drawable.united_states_of_america,"United States Of America"));
        lstData.add(new DataItem(R.drawable.uruguay,"Uruguay"));
        lstData.add(new DataItem(R.drawable.uzbekistan,"Uzbekistan"));
        lstData.add(new DataItem(R.drawable.vatican_city,"Vatican City"));
        lstData.add(new DataItem(R.drawable.venezuela,"Venezuela"));
        lstData.add(new DataItem(R.drawable.vietnam,"Vietnam"));
        lstData.add(new DataItem(R.drawable.yemen,"Yemen"));
        lstData.add(new DataItem(R.drawable.zambia,"Zambia"));
        lstData.add(new DataItem(R.drawable.zimbabwe,"Zimbabwe"));

        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter adapter = new CustomAdapter(this,R.layout.country_item,lstData);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent();
                intent.putExtra("Country",lstData.get(position).countryName);
                intent.putExtra("Flag",lstData.get(position).resIdThumbnail);

                intent.setClass(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }


    }

