package hust.plane.web.controller.vo;

import hust.plane.mapper.pojo.Route;
import hust.plane.utils.DateKit;
import hust.plane.utils.LineUtil;

import java.util.ArrayList;
import java.util.List;


public class RouteVo {

    private String routeId;
    private String status;
    private List<ArrayList<Double>> routePath;
    private String descripte;
    private String updateTime;
    private String type;
    private String createTime;


    public RouteVo(Route route) {

        this.routeId = route.getRouteId();
        if (route.getStatus() != null) {
            this.status = route.getStatus();
        }
        if (route.getRoutePath() != null) {

            this.routePath = LineUtil.stringLineToList(route.getRoutePath());
        }
        if (route.getDescripte() != null) {
            this.descripte = route.getDescripte();
        }
        if (route.getUpdateTime() != null) {
            this.updateTime = route.getUpdateTime().toString();
        }
        if (route.getCreateTime() != null) {
            this.createTime = DateKit.dateFormat(route.getCreateTime(),"yyyy/MM/dd HH:mm:ss");
        }
        if (route.getType() != null) {
            this.type = route.getType();
        }

    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ArrayList<Double>> getRoutePath() {
        return routePath;
    }

    public void setRoutePath(List<ArrayList<Double>> routePath) {
        this.routePath = routePath;
    }

    public String getDescripte() {
        return descripte;
    }

    public void setDescripte(String descripte) {
        this.descripte = descripte;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}
