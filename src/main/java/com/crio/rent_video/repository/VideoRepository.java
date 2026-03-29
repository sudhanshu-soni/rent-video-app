package com.crio.rent_video.repository;

import com.crio.rent_video.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    // Additional query methods if needed
}
