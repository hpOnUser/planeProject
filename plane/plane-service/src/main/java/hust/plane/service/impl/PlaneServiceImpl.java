package hust.plane.service.impl;

import hust.plane.mapper.mapper.PlaneMapper;
import hust.plane.mapper.pojo.Plane;
import hust.plane.service.interFace.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService{
	
	@Autowired
	public PlaneMapper planeMapper;

	@Override
	public List<Plane> getAllPlane() {
		
		List<Plane> planeList = planeMapper.selectALLPlane();
		return planeList;
	}

	@Override
	public List<Plane> getPlaneByOption(String userid, Date starttime, Date endtime) {
	
		List<Plane> planeList = planeMapper.selectPlaneByOption(userid,starttime,endtime);
		
		return planeList;
	}

	@Override
	public List<Plane> findByPlaneStatus(Plane plane) {
		
		List<Plane> planeList = planeMapper.selectByPlaneStatus(plane.getStatus());
		return planeList;
	}

	@Override
	public Plane getPlaneByPlane(Plane plane) {
		
		return planeMapper.getPlaneByPlane(plane);
	}


}
