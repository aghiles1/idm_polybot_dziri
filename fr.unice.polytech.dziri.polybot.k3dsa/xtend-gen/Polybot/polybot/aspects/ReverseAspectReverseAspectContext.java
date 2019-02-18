package Polybot.polybot.aspects;

import Polybot.polybot.aspects.ReverseAspectReverseAspectProperties;
import java.util.Map;
import polybot.Reverse;

@SuppressWarnings("all")
public class ReverseAspectReverseAspectContext {
  public final static ReverseAspectReverseAspectContext INSTANCE = new ReverseAspectReverseAspectContext();
  
  public static ReverseAspectReverseAspectProperties getSelf(final Reverse _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.ReverseAspectReverseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Reverse, ReverseAspectReverseAspectProperties> map = new java.util.WeakHashMap<polybot.Reverse, Polybot.polybot.aspects.ReverseAspectReverseAspectProperties>();
  
  public Map<Reverse, ReverseAspectReverseAspectProperties> getMap() {
    return map;
  }
}
