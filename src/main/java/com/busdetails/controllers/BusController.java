package com.busdetails.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.busdetails.model.Bus;
import com.busdetails.service.BusService;

@Controller
public class BusController {

	@Autowired
	BusService busService;

    //the welcome page
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

    //show the add bus form and also pass an empty backing bean object to store the form field values
	@RequestMapping(value = "/addNewBus", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addBus", "bus", new Bus());
	}


    //Get the form field values which are populated using the backing bean and store it in db
	@RequestMapping(value = "/addNewBus", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("bus") Bus bus) {
		busService.insertBus(bus);
		List<Bus> buses = busService.getAllBuses();
		ModelAndView model = new ModelAndView("getBuses");
		model.addObject("buses", buses);
		return model;
	}

    //show all buses saved in database
	@RequestMapping("/getBuses")
	public ModelAndView getBuses() {
		List<Bus> buses = busService.getAllBuses();
		ModelAndView model = new ModelAndView("getBuses");
		model.addObject("buses", buses);
		return model;
	}
	
	@RequestMapping(value = "/deleteBus", method = RequestMethod.GET)
	public ModelAndView processDelete(@ModelAttribute("bus1") Bus bus) {
		busService.deleteBus(bus);
		List<Bus> buses = busService.getAllBuses();
		ModelAndView model = new ModelAndView("deleteBus");
		model.addObject("buses", buses);
		return model;
	}
		
		@RequestMapping(value = "/updateBus", method = RequestMethod.GET)
		public ModelAndView processUpdate(@ModelAttribute("bus2") Bus bus) {
			busService.updateBus(bus);
			List<Bus> buses = busService.getAllBuses();
			ModelAndView model = new ModelAndView("updateBus");
			model.addObject("buses", buses);
			return model;

	}
		
	@RequestMapping(value = "/findBus", method = RequestMethod.GET)
	public ModelAndView showBus() {
		return new ModelAndView("findBus", "bus", new Bus());
	}
	@RequestMapping(value="/findBus",method = RequestMethod.POST)
	public ModelAndView FindBus(@ModelAttribute("bus") Bus bus) {
		//busService.FindBusById(bus);
		List<Bus> buses = busService.FindBusById(bus);
		ModelAndView model = new ModelAndView("findBusID");
		model.addObject("buses", buses);
		return model;
	}
	
	@RequestMapping(value = "/findType", method = RequestMethod.GET)
	public ModelAndView showBus1() {
		return new ModelAndView("findType", "bus", new Bus());
	}
	@RequestMapping(value="/findType",method = RequestMethod.POST)
	public ModelAndView FindBus1(@ModelAttribute("bus") Bus bus) {
		//busService.FindBusById(bus);
		List<Bus> buses = busService.FindBusByType1(bus);
		ModelAndView model = new ModelAndView("findBusType");
		model.addObject("buses", buses);
		return model;
	}
	@RequestMapping(value = "/findOff", method = RequestMethod.GET)
	public ModelAndView showBus2() {
		return new ModelAndView("findOff", "bus", new Bus());
	}
	@RequestMapping(value="/findOff",method = RequestMethod.POST)
	public ModelAndView FindBus2(@ModelAttribute("bus") Bus bus) {
		//busService.FindBusById(bus);
		List<Bus> buses = busService.FindBusByOff(bus);
		ModelAndView model = new ModelAndView("findBusOff");
		model.addObject("buses", buses);
		return model;
	}

}