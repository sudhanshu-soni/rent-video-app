package com.crio.rent_video.service;

import com.crio.rent_video.model.Video;
import com.crio.rent_video.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllAvailableVideos() {
        return videoRepository.findAll().stream()
                .filter(Video::isAvailable)
                .toList();
    }

    public Video createVideo(Video video) {
        video.setAvailable(true); // All videos are available by default
        return videoRepository.save(video);
    }

    public Optional<Video> updateVideo(Long id, Video updatedVideo) {
        return videoRepository.findById(id).map(video -> {
            video.setTitle(updatedVideo.getTitle());
            video.setDirector(updatedVideo.getDirector());
            video.setGenre(updatedVideo.getGenre());
            video.setAvailable(updatedVideo.isAvailable());
            return videoRepository.save(video);
        });
    }

    public boolean deleteVideo(Long id) {
        if (videoRepository.existsById(id)) {
            videoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
