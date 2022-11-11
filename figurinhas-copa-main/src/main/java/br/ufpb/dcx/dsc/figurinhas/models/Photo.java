package br.ufpb.dcx.dsc.figurinhas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_photo")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "photo_id")
    private Long photoId;

    @Column(name = "url")
    private String URL;

    @OneToOne(mappedBy = "photo")
    private User user;

    public Photo(){

    }

    public Photo(String URL){
        this.URL = URL;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoId=" + photoId +
                ", URL='" + URL + '\'' +
                ", user=" + user +
                '}';
    }
}
