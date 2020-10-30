package com.romychsa.favorito_mascota.RestApi;

public class ConstantesRestApi {
    public static final String COD_USER_PERMISSION = "/me/";
    public static final String URL_BASIC_GRAPH = "https://graph.instagram.com" + COD_USER_PERMISSION;
    public static final String TYPE_ACCION_PERMISSION = "media?fields=";
    public static final String TYPES_ACCESS_MEDIA = "id,media_url,caption,timestamp,media_type,permalink,thumbnail_url,username";
    public static final String ASK_FOR_ACCESS_TOKEN= "&access_token=";
    public static final String ACCESS_TOKEN = "IGQVJVSlZAIYWZANaW1aMjhjeU9NcTdZAUUdCdlpfSDFJUmJpZAkZAKRVJuZAzdFTm9FckhMUGRGRHFURnFBekFRZAHZAwb01VMkpvb3pGOTAxd2hvTW9MZAFZA2bExrTUNhRm9TdFdxNUl4YmcwaVJvRC0xeWwzMQZDZD";
    //public static final String ACCESS_TOKEN_2 = "IGQVJYbGVmSEtLTGxCREVicVV5aGx3Rl9FWmV1VFYzZAXYzUVZAhY1hGZAHUxLVVvTVBWdmktWTVKYjJnOTI1VjJjNm5OVEhaMVlIc2pHb0pJeHVDRGJCdWMtSWxwQnEtWWxRWFUzaEpn";
    public static final String URL_GET_RECENT_MEDIA_USER = URL_BASIC_GRAPH + TYPE_ACCION_PERMISSION + TYPES_ACCESS_MEDIA + ASK_FOR_ACCESS_TOKEN + ACCESS_TOKEN ;


    //https://graph.instagram.com/me/media?fields=id,media_url,caption,timestamp,media_type,permalink,thumbnail_url,username&access_token={poner access-token}

}
