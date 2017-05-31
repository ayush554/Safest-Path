package farmiction.ayush.example.com.myapplication;
import java.util.List;

/**
 * Created by mohit on 4/7/2017.
 */

public class DataParser {

    /**
     * html_attributions : []
     * next_page_token : CpQCBQEAAKf7tJt4eZtSPRva7cpocDKoPjBX7HBuEJzF2OjeAvcLjhmK6EcOcZyXLFPZc3ZQQQ6geGV0l-ouynk56Yv_q6E-DSYNMNnZeH2sJB24BxS1aj3ebHzaWpq879y7odKNfWUzRs48-lFBNC9K4U5F45tDJxEfC5kqkjBxUWWwRZzNvZwpPJt1WTCBYkjcYy9pKIQ4tko_R2bwOBtQs7ELxfIfGDY-o9-up2f9NHT-4p6itJqdC8efSdaVbDp3OeH75wk3WF7TJYUrupFLFYZsEL9Y5UetfEdASdfNxJQv59Vz5hgEFCZrXL6qCjj6VyjQdn9zEkxFqNcxeJyREIoNOR8dmeDzuTGr-q4B-Qax3qUtEhDE6uy0PggQMfUUGXz2mXeSGhThfO2VZfGH32SeHw0zBbXI9fP66w
     * results : [{"geometry":{"location":{"lat":12.8229418,"lng":80.0479642},"viewport":{"northeast":{"lat":12.8242907802915,"lng":80.0493131802915},"southwest":{"lat":12.8215928197085,"lng":80.04661521970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"96a4b8bb64000b1acc20dd899f38cdde4ea92c45","name":"Ganesh Auditorium","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1228,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/106697936345112121917/photos\">Pratap Raj Srivastava<\/a>"],"photo_reference":"CoQBdwAAAM6iNaBpcPtlGnszFeeMWHjdiPl7ZbsvKKgaJULaDJg3WucXctbTfdzGdTTs3MmgigvZ7cRplcMBNKIj93-onzuNVa7AWPdK2jpRbIrkWjhUY6HEgGTL5Ku75AtSQwLxqcL6Fh_9plYrkKtW5Orq3RYy8TwAXYiSGoeZ0-ZnknJaEhBmXeCG56rFlWGGKomPOSS0GhTxJNirf-gbLISnikT47yWBxVpnjw","width":3792}],"place_id":"ChIJx1sQUwv3UjoRkYAhtC-32MU","rating":2.7,"reference":"CmRSAAAAQGMfxz2y27Gaq8FxMn_FEQhZ2BoYL01XAOk9HJDMngV4I9lrzmtB7bZfGjOvvo1FUoMCBUWE8Iv-jQzyIn2NxSgBNfQTgFzGwTmZTojhW_yo-Q6TQRFdHO9bhuMFHWSZEhAmqrCBIhECm2iKKiWe9Q6dGhSuu1Lki8Ox3-Fmlh1fQwX3HE92Bg","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"SRM Nagar, Potheri Village , Kancheepuram District, Kattankulathur"},{"geometry":{"location":{"lat":12.8253437,"lng":80.0484306},"viewport":{"northeast":{"lat":12.8266926802915,"lng":80.04977958029151},"southwest":{"lat":12.8239947197085,"lng":80.0470816197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/school-71.png","id":"8005895ddef0239508be0cbafae3f5768f66443e","name":"SRM Dental College","photos":[{"height":4008,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112472603757280149062/photos\">HARIPRASAD P S<\/a>"],"photo_reference":"CoQBdwAAABrMfx4qGqGxFNWjlqDrix2rPLFuBNU5ekMTyiEldy_KM3HnmaLD7CpBqgMf22bC2ejE8qAGrOBODGrMjVjpbzpkCKaomwK-3aakZWFu775ruzPjn1JeQp3pRU6CBKKJOt60Pd-kux3jkmxqkG2SbiY4elXyG9OJ_vU1oajlJyGfEhDHeZoHkcl8b0bPNRWRq9jqGhSsj_dX1DyOswjtdXtft_iqIccr2g","width":5344}],"place_id":"ChIJYRcAZQv3UjoREACNkfFEWh8","rating":3.5,"reference":"CmRRAAAAbg_c10FALsuDTQc2QXnB5UfgHuhcAyJg5flbgu73gmFFB2VzBYR9KBpbGXp6zTFhc5Jw3KXjDrz6KulpYJdkN2tpsegjM7u6H1zE45It8CwF5AnNKAjB5YZfco7fDJsZEhD_3gQ4cQ5wVjEjxYHq3ClxGhS1t5Lw-omrg6uoP_zF4oCTi429dA","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Potheri, Kattankulathur"},{"geometry":{"location":{"lat":12.8429984,"lng":80.0583928},"viewport":{"northeast":{"lat":12.8443347802915,"lng":80.0597533302915},"southwest":{"lat":12.8416368197085,"lng":80.0570553697085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"71afb4ae6def20889a7b282da9b42a6ef7f646f9","name":"Natural smile a complete family dental clinic","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJfdDghKv3UjoRdriLT4h3-Qs","reference":"CmRRAAAAbvygaPc1RbieeIj-HnqdwLPmv5EExVHC3W7hK33sv9YCtFueW3qkXEK5itlFD1quxKRuR1B8HJxhxM570a1cLhfwJSRSg0fklOHcJP_ZjCFrnEtEmZMjQM372K7p-kfwEhBCnmeFm13e4QvhzcIMBSmTGhSVj1UxcscHyZj-xgJYl0cFHrQyjQ","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"No :183/5 First floor,(opp to Chellamani & co)G.S.T Road ,, NH Service Road, Guduvanchery"},{"geometry":{"location":{"lat":12.8408351,"lng":80.0563383},"viewport":{"northeast":{"lat":12.8421611802915,"lng":80.0577094302915},"southwest":{"lat":12.8394632197085,"lng":80.05501146970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"03c5f5f4007cf97d8b0b03e1d7e519cf6bf8b4f6","name":"srm medical college","place_id":"ChIJK6451av3UjoRz0oOJ6wux6Y","reference":"CmRSAAAAKtsa2ChI21deVdRQSVnlN_bxFY-5GKBkQhiEqub-IMjVGMrKaVsGG3w4ovJz_ZoMSGKymfA-K2hExZCPIkhwG_wTRswOQZE2O9_AIlT_WMvoTdUPsIf0Vigs5qtrefRhEhCiVqouYmJ7TgjElRxnv7ObGhSbgK0yKAKW7XilUcfcogg_51JWkA","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Grand Southern Trunk Road"},{"geometry":{"location":{"lat":12.7971287,"lng":80.02476879999999},"viewport":{"northeast":{"lat":12.7984595802915,"lng":80.0260913302915},"southwest":{"lat":12.7957616197085,"lng":80.02339336970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"dc765b6eaca9af5931b55b474ac72d507c9413e7","name":"reva dental clinic","place_id":"ChIJNxhnMuL5UjoRmOB2j-1rgJg","rating":5,"reference":"CmRSAAAAPl1FsbOGq7iRs0V0isSC2pJMnpFcCknfVb1shdlepscyXEdqmWctfJAs12NsjO8h4KQr-mSVpz1bBYiwrkzm_wJB2BcCyjDGewEuxrN5QHBX7P9j64XnjGsJQonVIzMREhCdS3hDqqgotC4HKlD9mhEOGhQqZ8fnwIhWtn4tHPVXUGjTnMzIwQ","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Thiruvalluvar Saalai, Maraimalai Nagar"},{"geometry":{"location":{"lat":12.844858,"lng":80.06106299999999},"viewport":{"northeast":{"lat":12.8462069802915,"lng":80.06241198029149},"southwest":{"lat":12.8435090197085,"lng":80.05971401970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"4b82bc168419f29db49f63bebc974544de935cd5","name":"Sumana Good Will Home","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":243,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102343713628213276099/photos\">Sumana Good Will Home<\/a>"],"photo_reference":"CoQBdwAAAHli42w5jV__vTLiL2lsjDS7NaCzesFk9Xkx3dY1K4gt0lPX5UsdFCoKOJhdk_yMfP4gTpBeWO3aChLvprKwyMtvMBBPFS99A3GeyAuj52cPjbhN5NAsyqWqGbmBLRalP25oFzKrxRc5eipapaj9JE8BCMF93SPHr7o_9j65bMBqEhBAShNkd2Q8gf9oqFfO3L6aGhQRHXNHpKRl-pTY3OjWvpKM_WYruw","width":682}],"place_id":"ChIJVVVVVaBoUjoRWi59_ejYzTA","reference":"CmRRAAAAD5tGxzrpI4YCI3K0XiOkngpLa_mi3sVnlsOZhEtedmz1HvEsdBaR3m0cUzUnx_lDP-UuZ7i6JpoESdjIsJo1_cUMu-AFOkC3TY5SGaOkBe2KXPxrixQWOJpsVq8cvIgfEhBDZao1gKp66kMZPdQq2yaTGhSPRhne9BoyRd6S1w5oFo9AW52Adg","scope":"GOOGLE","types":["hospital","health","point_of_interest","establishment"],"vicinity":"No.12, 2 nd Cross Street,Mahalakshmi Nagar,, Guduvancherry,, Kancheepuram Dist,"},{"geometry":{"location":{"lat":12.842334,"lng":80.057662},"viewport":{"northeast":{"lat":12.8436153802915,"lng":80.05907913029151},"southwest":{"lat":12.8409174197085,"lng":80.05638116970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"ac817a737d5d947c53c746f7b6c4ec989fd597ec","name":"K.R. Hospital","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":705,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102952938666615336472/photos\">K.R. Hospital<\/a>"],"photo_reference":"CoQBdwAAAFNessPmXc57LuWXk1oO99e-LTgwr1_TvtdsUnqlUna4i_VJ6loZLUn5dbOywtgTWB2S3RuR4zNqhKaHMv20P14Wd9m2PkX7UZNXXz4sqTpV5Y7rysjkOaWVkL_0wKtGA-fGouaVCX90pvGxisi_RW2rOP1niPEepl00pxVkfcVdEhDWMCzW0cJgIDnEK4FUeo5uGhRDOJXLF2gHy5y8MWYId8UGqyoUpQ","width":707}],"place_id":"ChIJtdaGv6v3UjoRpikwHd-pClk","rating":3.1,"reference":"CmRRAAAAlpAbFUW3_97x_VkC_aQfNVn30pDG0k5WIsAPQVz7QiXTvlnIhGC8q6ScW7b7Pnwv501OngXRR1AAYe-Cmk-3jWFCXnX_0RbKRhtjn6hyAMinc0dVuyRBYtILiYidEIECEhCyr4OIl2B-etSq5RbqKbGfGhS0mfei-TL2QQCsioATF8_-s50csg","scope":"GOOGLE","types":["hospital","doctor","health","point_of_interest","establishment"],"vicinity":"174, Grand Southern Trunk Road, Guduvanchery"},{"geometry":{"location":{"lat":12.7953206,"lng":80.02166110000002},"viewport":{"northeast":{"lat":12.7966695802915,"lng":80.02301008029151},"southwest":{"lat":12.7939716197085,"lng":80.0203121197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"81f8736e852b36aa422d776eca169a067203c1e4","name":"Surya Hospital","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":4160,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115547557137276516419/photos\">Har ish<\/a>"],"photo_reference":"CoQBdwAAAFgD7wYEZa8P9AxrfOjYBiVu9s0lA2xlqsnKSXHJyi2ndxUkXRql4MU_3XZhlpVCZvFylpzQmEidgcDeoxXl9gGJu_8S2UnWkfz0PW1qu3oUJ5i-ZLAPtr0POljM6ADAnCjgVKlh91xNhVPEY-28TjBEyA4BwpkAFwk2VroIN_ebEhDljPt-UhSUOyhAmAvgQw0XGhSiH2R3PAs5cDgfJ2sm4gLTsr0GnA","width":3120}],"place_id":"ChIJk1Fba-P5UjoRkFHQFhWAO_s","rating":5,"reference":"CmRSAAAA7elQW7XJr-ASHeNP81vaf0Ckqo8JJyH2bp3iTvZozOxJOjuEU56HIHW1W_qlgrY-ZrEf7ITDXt1IvJ4zhXx6EFusU9E-dBaVOxeemg1TjDt8cFQz9gASiz6RLGQlji-yEhDEiDXfOCWD_igMXFKQU2k6GhQgpJ2xbaJsWS5K5GS8B2vy4LnUfA","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Maraimalai Nagar, Chengalpattu"},{"geometry":{"location":{"lat":12.8183202,"lng":80.03780499999999},"viewport":{"northeast":{"lat":12.8201742802915,"lng":80.03854849999999},"southwest":{"lat":12.8174763197085,"lng":80.0355745}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"5481db0d1123be628e6c6d40fd56247c945262e1","name":"V Caare Medicals","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":480,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/115272628587049702925/photos\">giri ramasamy<\/a>"],"photo_reference":"CoQBdwAAAF9hpJt4UUDpDt7sfsw44OtKD64HIBcV5NmvMSAihlYEi-dxBhRebxq0tG0vj-Klq5JlzQP2p4jafFaWctT2XNpCMUNNFykU8iUnFnKj3nY1LVYLYscWOE55UGj77SGWnmkcVZDiaN5cHtvEFpcC-fSGS4vZuFRO4sX9XWS7tS0nEhAWU5fB116EpjKdwH-4boTzGhTrJinBoAUST9WWh47NdnNPTItGVA","width":640}],"place_id":"ChIJSdGxFmz3UjoRyj-kMLRbfFs","reference":"CmRRAAAAtdAOZHJCfZuX6PPx_a36GKFnHZykDdqwdceMkUDu1mXBNt5T_R6RF_9MqfHgoUaDtslsuvj4BUPK8McaVEcFc0JPV2OuSdfxLlhLM53L23fWJUYm79eJSnEdCx73DIqzEhD-eM-7nsI5P5PFe7-61suQGhRFhCV0mRGmg6cjySV5pFSbqBuZ6w","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"No 23,, Thiruvalluvar Street, Trichy-Chennai Highway, Potheri, Kattankulathur"},{"geometry":{"location":{"lat":12.8201496,"lng":80.0490193},"viewport":{"northeast":{"lat":12.8214985802915,"lng":80.05036828029151},"southwest":{"lat":12.8188006197085,"lng":80.0476703197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"71735dd988401103d7bbb6c02ab431f4b95071aa","name":"Mortuary","place_id":"ChIJC1u5ZnT3UjoRifWw2vmbVmo","reference":"CmRRAAAAehxP7WDYM0hrA5SwTQgId5Ph9gNbKPe7kwzKBETwBCmfnAHFmQvNFkIzBsHQz0qLhCswwSjsZQV2kl214zSJXqHHS7HmGuni8mGuZWRvolLMjctdoHDaP7PuKDLZbuBBEhAYGHG-lPPOZ-vMp3sK1Zg0GhRE5Yzau-VqSSBhwt36ed5S7w-3ww","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Potheri, Kattankulathur"},{"geometry":{"location":{"lat":12.8228843,"lng":80.0487417},"viewport":{"northeast":{"lat":12.8242332802915,"lng":80.05009068029149},"southwest":{"lat":12.8215353197085,"lng":80.04739271970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"4b656910d2c8a535decdfb65f7f05d758a084122","name":"SRM Hospital","place_id":"ChIJ9c-tsXT3UjoRAUa6Y-Mh3YM","reference":"CmRSAAAA3_S_ZO0Q5kTn5086g7p409bJVR2sq6oEKxqvFjXSF8D5vYYZWa0G_z3Eafq5RhbcjjU6Hsy4zHJddjUrz8A0d2b7ftrJREOuUtrXKuRGlg-sOjJe3HO7bbCwbBytvxjmEhAT7H_QCPqdGmbUXF1FrmpbGhRL0j3QQv-yG0bjs4ChS9J29yEXCA","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"SRM Nagar"},{"geometry":{"location":{"lat":12.8235928,"lng":80.0498065},"viewport":{"northeast":{"lat":12.8249417802915,"lng":80.05115548029151},"southwest":{"lat":12.8222438197085,"lng":80.0484575197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"57fe19968cbd99aab18a07cfbd801c1c20bc8954","name":"SRM Medical Dean Quarters","place_id":"ChIJB-MDMwv3UjoRpn_IWbUnydo","reference":"CmRSAAAAqcA3xQrg7EOoG_Uf0tntbBoN6FG13AMz79HDwxblc7pcrgoUR6UMjcltG7G12v-v6cJyuG9IYFoCzneYVrpEkwnG9i3lx3n3xcfg9tOk_MDyD-9mGB_pdsN4Q6_XfVmxEhBYbigStCtCaY381rJYwBUaGhROBCjIko1uGDOUXVjt4_lJjTN-xg","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Potheri, Kattankulathur"},{"geometry":{"location":{"lat":12.809387,"lng":80.03023},"viewport":{"northeast":{"lat":12.8107359802915,"lng":80.03157898029151},"southwest":{"lat":12.8080380197085,"lng":80.02888101970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"8a40858544b5c8a9d0456b86575b47310284b712","name":"Jai Balaji Clinic","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJwwP5bl33UjoRrRhMHZclHJY","reference":"CmRSAAAAH7OlhA0_4_hHa0qGMbzoCa-7rKoqgSgbYk3vrRGeTznPyC5Wk2Ig5XLda9Rm1TZ_2TJvPrE4Zo2iOie9ssqfPlNM283zh_XZmfmLqiFcO5t4SkBn_8oj0MhddtoiIKbZEhCx781KDGWS_2005N3z73gAGhTCVBD4QM7EJuxG-fxAhcpFIZkQ2A","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"86 Sadhasivam road, Kattankulathur"},{"geometry":{"location":{"lat":12.8346269,"lng":80.0498782},"viewport":{"northeast":{"lat":12.8359976302915,"lng":80.0512038302915},"southwest":{"lat":12.8332996697085,"lng":80.04850586970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"9bcd499980f2565c52c5dd8413af3d2e21bbafdd","name":"kr hospital","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJf4HinAj3UjoRT2vccPsswJs","rating":4,"reference":"CmRSAAAAsrvbU6kCkE1dIpgIzSoW5qLRuxfbkuCmh1iJ1_kZtxWPJNVTuZPx5UYXbQC-RLvCODjQMgJNc47ERgIjDh2FLRNBjxSZdO9NU5a7E8zKLCQk4rZKfc6dFCddXO4Y1jMIEhCrEfSM_UeyVOHXIHbNATsTGhQoqkSqII8fgYEdGiFf6-Wh1RnARQ","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"174, Chennai Theni Highway, Guduvanchery"},{"geometry":{"location":{"lat":12.8341106,"lng":80.05669209999999},"viewport":{"northeast":{"lat":12.8354845302915,"lng":80.0579979802915},"southwest":{"lat":12.8327865697085,"lng":80.0553000197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"47c2a651f64b639ca04941708a4d844f4f240de6","name":"Informh Home","opening_hours":{"open_now":true,"weekday_text":[]},"place_id":"ChIJx9NuMab3UjoRFfXMubHng0M","rating":5,"reference":"CmRRAAAAnVyvTU0QBIT7HLs7porIHEA2q7G9c3f0B2Vah3KWVYg0eFxwGj2hS4CtmvrkcnwSs8RLjogfotpgxY_x45XCDdu9swQILi8PQSOIzZmGHXF12wKbG0l1rG7JXhxYN1TvEhBmVQC-0z9aAWF4nzJJ0ENCGhQsI03rFCFTCFXddKovUjBOfnHbEw","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"no.41,, Malligai Street, Rajeshwari Nagar, Guduvanchery"},{"geometry":{"location":{"lat":12.8367879,"lng":80.0571156},"viewport":{"northeast":{"lat":12.8381368802915,"lng":80.0584645802915},"southwest":{"lat":12.8354389197085,"lng":80.05576661970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"63d81e2c95a2c7b096e3740fc452c49d904c443e","name":"Gramiya marunthagam","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJHwLG7aj3UjoRuN49U0lcnHM","reference":"CmRRAAAAK4VTY25Fl1OzU5_J9nfMY9K9UuvmTFIZUGzV6shE6D4ZTzJ0_Gn1C-KMCLZqp5pAtIUSyBvY8I-SCr8UfzV_iuZgNSIrBIfBWS1xwyTW4iYCiLlBtrCZMoBdiD7qxTN9EhBDdiMsSEfMao_zAYg3ZXJGGhQVoVscRGUBmfJll2hGiP4Xp5sa_Q","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"No, 61. First main road, K.K.Nagar, Srinivasapuram, Kumaran Nagar, Guduvanchery"},{"geometry":{"location":{"lat":12.7995075,"lng":80.0236577},"viewport":{"northeast":{"lat":12.8008564802915,"lng":80.02500668029151},"southwest":{"lat":12.7981585197085,"lng":80.02230871970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"bdc1d0c01786dde066de07c876916232629d55a7","name":"JS Hospital","place_id":"ChIJX_36duL5UjoRVwX1FM686h0","rating":1.1,"reference":"CmRRAAAAMsgmporyUrDyCuhasDO5zHCnlGSZWWQSJERsw09zzBtsIoz_k9yGS-TS7r_ixy65HTnCdV8HG7UD_x0texXDaWFqxXmwMwHjT2rh0lICyvLKU1ujBG3Vr_MTfnjN4JFOEhC_HprwKz4lM2qvwBLMc2hXGhSgGzHFsY3COguqiALPWQHdwOUtrw","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"No.12, MGR Road, NH1, HIG, Maraimalai Nagar"},{"geometry":{"location":{"lat":12.8400575,"lng":80.0558992},"viewport":{"northeast":{"lat":12.8414157802915,"lng":80.0572385802915},"southwest":{"lat":12.8387178197085,"lng":80.05454061970848}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"d12f580a74430bda7dceaa26de986adf0308fa59","name":"GST Health Care","place_id":"ChIJ4xWlhKn3UjoRgMFm2w-huJU","reference":"CmRSAAAAYCtKaorw0NYk4IjjKPHicmezaKQcAHmqTbvJbVLRdxPwHl8zuS40XNQQDSLX-D9iRG1Ky6p_QveznXUXNxBek0ZY_selWY7-F60RG76QsbssnJQidobkkQihcAqmBub9EhAZqCAKmwlxvqL7guw5YVDjGhS7aKYwaA4s5LBdNyskpi-kAPFdXQ","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"NH Service Road, Guduvanchery"},{"geometry":{"location":{"lat":12.7988693,"lng":80.0238277},"viewport":{"northeast":{"lat":12.8002182802915,"lng":80.02517668029151},"southwest":{"lat":12.7975203197085,"lng":80.02247871970849}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"c9e3bc5db0cfc6199fe4915247048b30d00e3bde","name":"Vanavil medical center","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJ8RbRbeL5UjoRrhh44chZlK8","rating":1,"reference":"CmRSAAAA28fPR941xoJt16CXYIg0a2c2acW-4aIDbdpUoykUOWRg3MfROZaiAGQ-f5EO0NKJYOEvwgQl50AjInCTsJ3NZ4h8xbtjNZiV96xb_itzOQM0L-rhnZ21QQFu4s9pKUBmEhCLrJIIOaHbez0lCAUjjgr9GhRaZ_UE9S8VMwlmvcm6Dq_SWFMjxg","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Maraimalai Nagar"},{"geometry":{"location":{"lat":12.7987438,"lng":80.0231065},"viewport":{"northeast":{"lat":12.8000927802915,"lng":80.02445548029151},"southwest":{"lat":12.7973948197085,"lng":80.0217575197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png","id":"deedfd7f6a3d99f2fdb3ea54208b52860d72f012","name":"Medical Shop","place_id":"ChIJibcVnlj3UjoRwccPE7GfJBM","reference":"CmRRAAAAoGnbpfIXGHHFjzbnTweGqnMMH45hC96A1K1pZe1lTw28-09hRvfwLCz7DR-bnB1fD3MToiRqP-Gz4tFjWd_FaIAk4SEqeYTuX7o4gNj2rmU9w3zDdAHe9mcvv6fEgs4kEhDQ9HEp9ObEETY_bWiU-IS8GhTkYREM3hZ5Dw1vTNDH-QMfYoQlOw","scope":"GOOGLE","types":["hospital","point_of_interest","establishment"],"vicinity":"Maraimalai Nagar"}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<?> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<?> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<?> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * geometry : {"location":{"lat":12.8229418,"lng":80.0479642},"viewport":{"northeast":{"lat":12.8242907802915,"lng":80.0493131802915},"southwest":{"lat":12.8215928197085,"lng":80.04661521970849}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/doctor-71.png
         * id : 96a4b8bb64000b1acc20dd899f38cdde4ea92c45
         * name : Ganesh Auditorium
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * photos : [{"height":1228,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/106697936345112121917/photos\">Pratap Raj Srivastava<\/a>"],"photo_reference":"CoQBdwAAAM6iNaBpcPtlGnszFeeMWHjdiPl7ZbsvKKgaJULaDJg3WucXctbTfdzGdTTs3MmgigvZ7cRplcMBNKIj93-onzuNVa7AWPdK2jpRbIrkWjhUY6HEgGTL5Ku75AtSQwLxqcL6Fh_9plYrkKtW5Orq3RYy8TwAXYiSGoeZ0-ZnknJaEhBmXeCG56rFlWGGKomPOSS0GhTxJNirf-gbLISnikT47yWBxVpnjw","width":3792}]
         * place_id : ChIJx1sQUwv3UjoRkYAhtC-32MU
         * rating : 2.7
         * reference : CmRSAAAAQGMfxz2y27Gaq8FxMn_FEQhZ2BoYL01XAOk9HJDMngV4I9lrzmtB7bZfGjOvvo1FUoMCBUWE8Iv-jQzyIn2NxSgBNfQTgFzGwTmZTojhW_yo-Q6TQRFdHO9bhuMFHWSZEhAmqrCBIhECm2iKKiWe9Q6dGhSuu1Lki8Ox3-Fmlh1fQwX3HE92Bg
         * scope : GOOGLE
         * types : ["hospital","point_of_interest","establishment"]
         * vicinity : SRM Nagar, Potheri Village , Kancheepuram District, Kattankulathur
         */

        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private OpeningHoursBean opening_hours;
        private String place_id;
        private double rating;
        private String reference;
        private String scope;
        private String vicinity;
        private List<PhotosBean> photos;
        private List<String> types;

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":12.8229418,"lng":80.0479642}
             * viewport : {"northeast":{"lat":12.8242907802915,"lng":80.0493131802915},"southwest":{"lat":12.8215928197085,"lng":80.04661521970849}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean {
                /**
                 * lat : 12.8229418
                 * lng : 80.0479642
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":12.8242907802915,"lng":80.0493131802915}
                 * southwest : {"lat":12.8215928197085,"lng":80.04661521970849}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 12.8242907802915
                     * lng : 80.0493131802915
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 12.8215928197085
                     * lng : 80.04661521970849
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class PhotosBean {
            /**
             * height : 1228
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/106697936345112121917/photos\">Pratap Raj Srivastava<\/a>"]
             * photo_reference : CoQBdwAAAM6iNaBpcPtlGnszFeeMWHjdiPl7ZbsvKKgaJULaDJg3WucXctbTfdzGdTTs3MmgigvZ7cRplcMBNKIj93-onzuNVa7AWPdK2jpRbIrkWjhUY6HEgGTL5Ku75AtSQwLxqcL6Fh_9plYrkKtW5Orq3RYy8TwAXYiSGoeZ0-ZnknJaEhBmXeCG56rFlWGGKomPOSS0GhTxJNirf-gbLISnikT47yWBxVpnjw
             * width : 3792
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }
}