package pl.edu.pjatk.pamo.skrawek.rest.service;

import pl.edu.pjatk.pamo.skrawek.rest.model.accounts.Account;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static pl.edu.pjatk.pamo.skrawek.rest.config.RequestMappings.API_ACCOUNT;

/**
 * This service defines REST API urls for <strong>Account</strong> module (AccountController)
 */
public interface AccountService {


    /**
     * Prepare call rest Api to fetch {@link Account} data
     *
     * @param email the email
     * @return the {@link Call<Account>}
     */
    @GET(API_ACCOUNT + "user")
    Call<Account> getAccountDetails(@Query("email") String email);
}
