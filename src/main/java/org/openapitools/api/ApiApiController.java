package org.openapitools.api;

import org.openapitools.model.AnnadataCustomer;
import org.openapitools.model.AnnadataUser;
import org.openapitools.model.AssignRequest;
import org.openapitools.model.AssignTestView;
import org.openapitools.model.BigEcomCart;
import org.openapitools.model.BigEcomCategory;
import org.openapitools.model.BigEcomCustomer;
import org.openapitools.model.BigEcomProduct;
import org.openapitools.model.BigEcomSale;
import org.openapitools.model.BigUserLogin;
import org.openapitools.model.Booking;
import org.openapitools.model.CityMaster;
import org.openapitools.model.CityMasterData;
import org.openapitools.model.CountryMaster;
import org.openapitools.model.CreateGoalView;
import org.openapitools.model.DashModel;
import org.openapitools.model.DashModelToday;
import org.openapitools.model.DataGraph;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.DistrictMaster;
import org.openapitools.model.DistrictMasterData;
import org.openapitools.model.EcomCart;
import org.openapitools.model.EcomCategory;
import org.openapitools.model.EcomCustomer;
import org.openapitools.model.EcomProduct;
import org.openapitools.model.EcomSale;
import org.openapitools.model.EnquirySearch;
import org.openapitools.model.EnquiryView;
import org.openapitools.model.ErmClient;
import org.openapitools.model.ErmClientProject;
import org.openapitools.model.ErmEmployeeView;
import org.openapitools.model.ErpProjectChange;
import org.openapitools.model.ErpProjectMeeting;
import org.openapitools.model.ErpProjectPayment;
import org.openapitools.model.EventBookingViewModel;
import org.openapitools.model.EventFilter;
import org.openapitools.model.EventLoginUser;
import org.openapitools.model.EventMaster;
import org.openapitools.model.EventUser;
import org.openapitools.model.Executive;
import org.openapitools.model.FarmerFilter;
import org.openapitools.model.FarmerMasterView;
import org.openapitools.model.FarmerVerificationModel;
import org.openapitools.model.FilterhotelBooking;
import org.openapitools.model.FoodCategoryMaster;
import org.openapitools.model.FoodItemList;
import org.openapitools.model.FoodItemMaster;
import org.openapitools.model.FoodItemType;
import org.openapitools.model.FoodItemView;
import org.openapitools.model.FoodOrder;
import org.openapitools.model.FoodOrderOpen;
import org.openapitools.model.FoodOrderView;
import org.openapitools.model.GoalCategory;
import org.openapitools.model.GoalLogin;
import org.openapitools.model.GoalUser;
import org.openapitools.model.HospitalAppointmentView;
import org.openapitools.model.HospitalPatient;
import org.openapitools.model.HotelCustomer;
import org.openapitools.model.HotelRoomMaster;
import org.openapitools.model.HotelUser;
import org.openapitools.model.InLanguage;
import org.openapitools.model.InLanguageTopic;
import org.openapitools.model.InQuestion;
import org.openapitools.model.JiraIssue;
import org.openapitools.model.JiraProject;
import org.openapitools.model.JiraUser;
import org.openapitools.model.JobApplication;
import org.openapitools.model.JobCategory;
import org.openapitools.model.JobEmployer;
import org.openapitools.model.JobListing;
import org.openapitools.model.JobSeekerViewModel;
import org.openapitools.model.JobUserView;
import org.openapitools.model.LoginModel;
import org.openapitools.model.LoginZomato;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.NewTicket;
import org.openapitools.model.NewhotelBooking;
import org.openapitools.model.Offer;
import org.openapitools.model.OfferView;
import java.time.OffsetDateTime;
import org.openapitools.model.QuizAssignedtest;
import org.openapitools.model.QuizAssignedtestViewModel;
import org.openapitools.model.QuizCategory;
import org.openapitools.model.QuizQuestionsViewModel;
import org.openapitools.model.QuizTestViewModel;
import org.openapitools.model.QuizUser;
import org.openapitools.model.QuotationBid;
import org.openapitools.model.QuotationBidFilter;
import org.openapitools.model.QuotationFilter;
import org.openapitools.model.QuotationMaster;
import org.openapitools.model.QuotationMasterView;
import org.openapitools.model.ReLogin;
import org.openapitools.model.ReqDepartment;
import org.openapitools.model.ReqEmployee;
import org.openapitools.model.ReqLeaf;
import org.openapitools.model.RequestFilter;
import org.openapitools.model.RoomAllotmentList;
import org.openapitools.model.RoomListViewModel;
import org.openapitools.model.RoomTypeMaster;
import org.openapitools.model.RoomTypeViewModel;
import org.openapitools.model.RoomViewModel;
import org.openapitools.model.Service;
import org.openapitools.model.ServicesView;
import org.openapitools.model.StateMaster;
import org.openapitools.model.StateMasterDATA;
import org.openapitools.model.StatusMasterView;
import org.openapitools.model.StatusMasterViewModel;
import org.openapitools.model.StockProduct;
import org.openapitools.model.StockPurchase;
import org.openapitools.model.StockSale;
import org.openapitools.model.TalukaMaster;
import org.openapitools.model.TempBooking;
import org.openapitools.model.TestLogin;
import org.openapitools.model.TrainAppBookingView;
import org.openapitools.model.TrainAppPassenger;
import org.openapitools.model.TrainAppStation;
import org.openapitools.model.TrainAppTrain;
import org.openapitools.model.TrainLogin;
import org.openapitools.model.UserLogin;
import org.openapitools.model.UserMaster;
import org.openapitools.model.UserMasterView;
import org.openapitools.model.UserModel;
import org.openapitools.model.VendorFilter;
import org.openapitools.model.VendorMaster;
import org.openapitools.model.VendorVerificationModel;
import org.openapitools.model.ViewGoalView;
import org.openapitools.model.VisitSearch;
import org.openapitools.model.WaterCustomer;
import org.openapitools.model.WaterCustomerObj;
import org.openapitools.model.WaterCustomerView;
import org.openapitools.model.WebinarRegistration;
import org.openapitools.model.WebinarRegistrationProd;
import org.openapitools.model.WeddingAllotment;
import org.openapitools.model.WeddingBookingList;
import org.openapitools.model.WeddingFoodItemList;
import org.openapitools.model.WeddingFoodItems;
import org.openapitools.model.WeddingMasterList;
import org.openapitools.model.WeddingMasterView;
import org.openapitools.model.WeddingPackage;
import org.openapitools.model.WeddingPackageMasterList;
import org.openapitools.model.WeddingService;
import org.openapitools.model.WeddingServiceView;
import org.openapitools.model.YouTubeUserBasicView;
import org.openapitools.model.YoutubeTicket;
import org.openapitools.model.ZomatoCartView;
import org.openapitools.model.ZomatoFoodCategory;
import org.openapitools.model.ZomatoMenuItem;
import org.openapitools.model.ZomatoOrderViewModel;
import org.openapitools.model.ZomatoRestaurant;
import org.openapitools.model.ZomatoUser;
import org.openapitools.model.ZoomBooking;
import org.openapitools.model.ZoomCarReview;
import org.openapitools.model.ZoomCarView;
import org.openapitools.model.ZoomLocation;
import org.openapitools.model.ZoomUser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T23:04:59.126991100-05:00[America/Toronto]")
@Controller
@RequestMapping("${openapi.miniProject.base-path:}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
