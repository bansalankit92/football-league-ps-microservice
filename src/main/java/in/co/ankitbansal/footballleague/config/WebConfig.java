package in.co.ankitbansal.footballleague.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

  @Value("${rest.client.read.timeout}")
  private int readTimeout;
  @Value("${rest.client.connect.timeout}")
  private int connectTimeout;

  public RestTemplate getRestTemplate() {
    RestTemplate restTemplate = new RestTemplate();
    HttpComponentsClientHttpRequestFactory rf =
        (HttpComponentsClientHttpRequestFactory) restTemplate.getRequestFactory();
    rf.setReadTimeout(readTimeout);
    rf.setConnectTimeout(connectTimeout);
    return restTemplate;
  }
}
