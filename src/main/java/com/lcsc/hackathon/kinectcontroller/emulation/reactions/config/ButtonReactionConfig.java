/*
This program is called "Kinect Controller". It is meant to detect gestures with the Kinect
and then simulate keyboard and/or mouse input. The configuration files used by this program are
not intended to be under the following license.

The Kinect Controller makes use of the J4K library and Esper and we have done
nothing to change their source.

By using J4K we are required to site their research article:
A. Barmpoutis. 'Tensor Body: Real-time Reconstruction of the Human Body and Avatar Synthesis from RGB-D',
IEEE Transactions on Cybernetics, Special issue on Computer Vision for RGB-D Sensors: Kinect and Its
Applications, October 2013, Vol. 43(5), Pages: 1347-1356.

By using Esper without their commercial license we are also required to release our software under
a GPL license.

Copyright (C) 2015  Jacob Waffle, Ryan Spiekerman and Josh Rogers

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

package com.lcsc.hackathon.kinectcontroller.emulation.reactions.config;


/**
 * Created by jake on 10/18/2015.
 * This is the configuration object for the ButtonReaction. Each of these Config objects are designed
 * to hold the configuration of a Reaction in a standardized way.
 */
public class ButtonReactionConfig extends ReactionConfig<String,Object> {
    /**
     * This loads buttons into the config map according to the
     * specifications of the ButtonReaction's needs.
     *
     * @param btnId         ID of the button that's being utilized.
     * @param deviceType    The device that the key exists on (e.g. 'keyboard' or 'mouse'.)
     */
    public void loadKey(int btnId, String deviceType) {
        //TODO Add support for more a sequence of keys to be executed.
        _config.put("DeviceType", deviceType);
        _config.put("ButtonId", btnId);
    }
}
