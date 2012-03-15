package trip.planner

class Trip {
      String name
      String city
      Date startDate
      Date endDate
      String purpose
      String notes
      static constraints = {
          name(blank:false)
          city(blank:false)
          startDate(blank:false)
          endDate(blank:false)
          purpose(blank:false)
      }
    }

