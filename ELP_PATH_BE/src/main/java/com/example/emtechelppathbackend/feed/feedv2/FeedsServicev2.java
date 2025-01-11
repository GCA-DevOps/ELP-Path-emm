package com.example.emtechelppathbackend.feed.feedv2;

import com.example.emtechelppathbackend.utils.CustomResponse;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FeedsServicev2  {

    CustomResponse<List<FeedsDTOv2>> getAllUsersFeeds();

    CustomResponse<FeedsDTOv2> getFeedById(Long Id);
   
    CustomResponse<List<FeedsDTOv2>> getFeedByUserId(Long user_id);

    CustomResponse<?> uploadFeeds(Long userId, FeedsDTO feedsDTO);

    CustomResponse<?> deleteFeed(Long id,Long userId);

    CustomResponse<?> getAllFeedsByHubId(Long hubId);

    CustomResponse<?> getAllFeedsByChapterId(Long chapterId);

    CustomResponse<?> updateFeedsById( Long userId,Long id, FeedsDTOv2 feedsDto);

    CustomResponse<?> getFeedDetailsById(Long feedId);


    CustomResponse<?> getAllFeeds();
}